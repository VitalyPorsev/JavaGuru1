package students.kate_br.lesson_6.level_3.task_14;

class ArrayService {

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }
}

