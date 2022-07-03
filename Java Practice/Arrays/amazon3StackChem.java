package Arrays;

import java.util.HashMap;
import java.util.Stack;

public class amazon3StackChem {

    public static void calculateAtomsInChemFormula(String chemFormula) {
        HashMap<Character, Integer> atomCount = new HashMap<>();
        Stack<Character> formulaStack = new Stack<>();
        int prevMulFact = 1, mulFact = 1, i = 0, countToAdd = 1;

        while (i < chemFormula.length()) {
            countToAdd = 1;
            formulaStack.add(chemFormula.charAt(i));
            if (Character.isAlphabetic(chemFormula.charAt(i))) { 
                atomCount.put(chemFormula.charAt(i), 0);
            }
            if (chemFormula.charAt(i) == ')') {
                i = i + 1;
                mulFact = Integer.parseInt(String.valueOf(chemFormula.charAt(i)));
                formulaStack.pop();
                while (formulaStack.peek() != '(') {
                    Character popAtom = formulaStack.pop();
                    System.out.println(popAtom + " m " + mulFact);
                    if (Character.isDigit(popAtom)) {
                        Character prevPopAtom = formulaStack.pop();
                        atomCount.put(prevPopAtom,
                                atomCount.get(prevPopAtom).intValue()
                                        + (Integer.parseInt(String.valueOf(popAtom)) * mulFact));
                    } else {
                        // if (atomCount.containsKey(popAtom)) {
                        atomCount.put(popAtom, (atomCount.get(popAtom).intValue() + 1) * mulFact);
                        // } else {
                        // atomCount.put(popAtom, 1 * mulFact);
                        // System.out.println("else");
                        // }
                    }
                }
                formulaStack.pop();
            }
            System.out.println(atomCount);
            i++;
        }

        while (!formulaStack.isEmpty()) {
            Character popAtom = formulaStack.pop();
            if (!Character.isDigit(popAtom)) {
                atomCount.put(chemFormula.charAt(i), 0);
                // System.out.println(atomCount);
            } else {
                Character prevPopAtom = formulaStack.pop();
                atomCount.put(prevPopAtom,
                        atomCount.get(prevPopAtom).intValue()
                                + Integer.parseInt(String.valueOf(popAtom)));
                // if (i - 1 >= 0 && chemFormula.charAt(i - 1) != '\0'
                // && atomCount.containsKey(chemFormula.charAt(i - 1))) {
                // countToAdd = Integer.parseInt(String.valueOf(chemFormula.charAt(i)));
                // atomCount.put(chemFormula.charAt(i - 1), atomCount.get(chemFormula.charAt(i -
                // 1)).intValue() +
                // countToAdd);
                // }
            }
        }
        System.out.println(atomCount);
    }

    public static void main(String[] args) {
        String chemFormula = "K4(ON(SO3)2)2";
        calculateAtomsInChemFormula(chemFormula);
    }
}
