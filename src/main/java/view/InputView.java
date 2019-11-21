package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static List<String> inputNames() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String name = scanner.nextLine();
        System.out.println();
        return Arrays.asList(name.split(","));
    }

    public static int inputHeight() {
        System.out.println("최대 사다리의 높이는 몇 개 인가요?");
        int height = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return height;
    }

    public static List<String> inputResult() {
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        String result = scanner.nextLine();
        System.out.println();
        return Arrays.asList(result.split(","));
    }

    public static String inputFindName() {
        System.out.println("결과를 보고 싶은 사람은?");
        String name = scanner.nextLine();
        System.out.println();
        return name;
    }
}
