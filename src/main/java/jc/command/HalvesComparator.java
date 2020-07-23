package jc.command;

public class HalvesComparator extends AbstractCommand<ComparisionEnum> {

        public HalvesComparator(InputHolder input) {
            super(input);
        }

        @Override
        public String name() {
            return "comparison of both halves";
        }

        @Override
        public ComparisionEnum execute() {
            Integer firstHalf = new FirstHalfSum(input).execute();
            Integer secondHalf = new SecondHalfSum(input).execute();

            return ComparisionEnum.compare(firstHalf, secondHalf);
        }
}
