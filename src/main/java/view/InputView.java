package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static List<String> inputNames() {
        System.out.println("참여할 사람 이름을 입력하세요");
        String name = scanner.nextLine();
        System.out.println();
        return Arrays.asList(name.split(","));
    }

    public static int inputHeight() {
        System.out.println("최대 사다리의 높이는 몇 개 인가요?");
        int height = scanner.nextInt();
        System.out.println();
        return height;
    }

}
