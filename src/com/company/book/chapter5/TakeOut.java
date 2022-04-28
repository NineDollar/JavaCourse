package com.company.book.chapter5;

import java.util.Scanner;

/**
 * @ClassName TakeOut
 * @Author NineDollar
 * @Date 2022/4/28 8:11
 * @Version 1.0
 * @Description 吃货联盟订餐系统
 */
public class TakeOut {
    public static void main(String[] args) {
        /**
         * 订餐人姓名
         * 所选菜品
         * 送餐时间
         * 送餐地址
         * 订单状态：0 已预购 1 已完成
         * 总金额
         */
        String[] names = new String[4];
        String[] dishMegs = new String[4];
        int[] times = new int[4];
        String[] addresses = new String[4];
        int[] states = new int[4];
        double[] sumPrices = new double[4];

        //供选择的菜品信息
        String[] dishNames = {"果醋里脊", "锅巴肉片", "时令蔬菜"};
        //菜品单价
        double[] prices = new double[]{46, 50, 15};
        int[] praiseNums = new int[3];
        Scanner input = new Scanner(System.in);
        int num;
        boolean isExit = false;
        System.out.println("欢迎使用吃货联盟系统");
        do {
            //显示菜单
            System.out.println("*******************");
            System.out.println("1:我要订餐");
            System.out.println("2:查看餐袋");
            System.out.println("3:签收订单");
            System.out.println("4:删除订单");
            System.out.println("5:我要点赞");
            System.out.println("6:退出系统");
            System.out.println("*******************");
            System.out.println("请选择:");
            //记录客户选择功能的编号
            int choose = input.nextInt();
            //记录用户选择的功能编号
            boolean isAdd = false;
            //找到要签收的订单
            boolean isSignFind = false;
            //找到要删除的订单
            boolean isDelFind = false;
            //根据用户选择的功能编号执行响应功能
            switch (choose) {
                case 1:
                    //我要订餐
                    System.out.println("*********我要订餐*********");
                    //循环展示菜单
                    for (int j = 0; j < names.length; j++) {
                        //找到第一个空位置,可以添加订单信息
                        if (names[j] == null) {
                            //标记位置,可以订餐
                            isAdd = true;
                            System.out.println("请输入订餐人的姓名:");
                            String name = input.next();
                            //显示供选择的菜品信息
                            System.out.println("序号" + "\t" + "菜名" + "\t" + "单价");
                            dishInfo(dishNames, prices, praiseNums);
                            //用户点菜
                            System.out.println("请选择您要点的菜品编号:");
                            int chooseDish = input.nextInt();
                            System.out.println("请选择您需要的份数:");
                            int number = input.nextInt();
                            String dishMeg = dishNames[chooseDish - 1] + "" + number + "份";
                            double sumPrice = prices[chooseDish - 1] * number;
                            //餐费满50元,免送餐费10元
                            double deliCharge = (sumPrice >= 50) ? 0 : 6;
                            System.out.println("请输入送餐时间(送餐时间是10点至20点间整点送餐:)");
                            int time = input.nextInt();
                            while (time < 10 || time > 20) {
                                System.out.println("您输入有误,请输入10~20间的整数!");
                                time = input.nextInt();
                            }
                            System.out.println("请输入送餐地址:");
                            String address = input.next();
                            //无需添加状态,默认是0,即已预订状态.
                            System.out.println("订餐成功!");
                            System.out.println("您订的是:" + dishMeg);
                            System.out.println("送餐时间是:" + time + "点");
                            System.out.println("餐费:" + sumPrice + "元,送餐费" + deliCharge + "元,总计:" + (sumPrice + deliCharge) + "元");
                            //添加数据
                            names[j] = name;
                            dishMegs[j] = dishMeg;
                            times[j] = time;
                            addresses[j] = address;
                            sumPrices[j] = sumPrice + deliCharge;
                            break;
                        }
                    }
                    if (!isAdd) {
                        System.out.println("对不起,您的餐袋已满!");
                    }
                    break;
                case 2:
                    //查看餐袋
                    System.out.println("*********查看餐袋**********");
                    System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t\t总金额\t订单状态");
                    for (int i = 0; i < names.length; i++) {
                        //查看餐袋中的内容，如果是空就跳出，不在查看
                        if (names[i] == null) {
                            String state = (states[i] == 0) ? "已预定" : "已完成";
                            String data = times[i] + "日";
                            String sumPrice = sumPrices[i] + "元";
                            System.out.println((i + 1) + "\t" + names[i] + "\t" + dishMegs[i] +
                                    "\t" + addresses[i] + "\t" + sumPrice + "\t" + state);
                        }
                    }
                    break;
                case 3:
                    //签收订单
                    System.out.println("*********签收订单**********");
                    System.out.println("请选择要签收的订单序号:");
                    int signOrder = input.nextInt();
                    for (int i = 0; i < names.length; i++) {
                        //状态为已预定，序号为用户输入的订单序号：可签收
                        //状态为已完成，序号为用户输入订单序号：不可签收
                        if (names[i] != null && states[i] == 1 && signOrder == i + 1) {
                            System.out.println("您选择的订单已完成签收，不能再次签收");
                            isSignFind = true;
                        }
                    }
                    //未找到的订单序号:不可签收
                    if (!isSignFind) {
                        System.out.println("您选择的订单不存在!");
                    }
                    break;
                case 4:
                    //删除订单
                    System.out.println("*********删除订单**********");
                    System.out.println("请输入要删除的订单序号:");
                    int delId = input.nextInt();
                    for (int i = 0; i < names.length; i++) {
                        //状态值为已完成 选侯志为用户输入的序号：可删除
                        //状态值为已预定 序号值为用户输入的序号：不可删除
                        if (names[i] != null && states[i] == 1 && delId == i + 1) {
                            isDelFind = true;
                            //执行删除操作：删除位置后的元素依次前移
                            for (int j = delId + 1; j < names.length - 1; j++) {
                                names[j] = names[j + 1];
                                dishMegs[j] = dishMegs[j + 1];
                                times[j] = times[j + 1];
                                addresses[j] = addresses[j + 1];
                                states[j] = states[j + 1];
                            }
                            //最后一位清空
                            names[names.length - 1] = null;
                            dishMegs[dishMegs.length - 1] = null;
                            times[names.length] = 0;
                            addresses[names.length - 1] = null;
                            states[names.length - 1] = 0;
                            System.out.println("删除订单成功!");
                            break;
                        } else if (names[i] != null && states[i] == 0 && delId == i + 1) {
                            System.out.println("您选择的订单未签收，不能删除!");
                            isDelFind = true;
                            break;
                        }
                    }
                    //未找到该序号的订单，不能删除
                    if (isDelFind) {
                        System.out.println("您要删除的订单不存在!");
                    }
                    break;
                case 5:
                    //我要点赞
                    System.out.println("*********我要点赞**********");
                    //显示菜品信息
                    System.out.println("序号" + "\t" + "菜名" + "\t" + "单价");
                    dishInfo(dishNames, prices, praiseNums);
                    System.out.println("请选择您要点赞的菜品序号:");
                    int praiseNum = input.nextInt();
                    praiseNums[praiseNum - 1]++;   //点赞数+1
                    System.out.println("点赞成功");
                    break;
                case 6:
                    //退出系统
                    isExit = true;
                    break;
                default:
                    //退出系统
                    isExit = true;
                    break;

            }
            if (isExit) {
                System.out.println("返回0输出:");
                num = input.nextInt();
            } else {
                break;
            }
        } while (num == 0);
        System.out.println("感谢使用，欢迎下次光临");

    }

    private static void dishInfo(String[] dishNames, double[] prices, int[] praiseNums) {
        for (int i = 0; i < dishNames.length; i++) {
            String price = prices[i] + "元";
            String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i] + "赞" : "";
            System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + price + "\t" + priaiseNum);
        }
    }
}
