package annotation;

@TestInfo(count = 1, testedBy = "KIM", testTools = {"JUnit", "AutoTester"},
        testType = TestType.FIRST,
        testDate = @DateTime(yymmdd = "160101",hhmmss = "235959")
)
public class AnnotationMain0 {
    public static void main(String[] args) {
        // AnnotationMain0의 객체를 얻음
        Class<AnnotationMain0> cls = AnnotationMain0.class;

        TestInfo anno = cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy() = " + anno.testedBy());

    }
}
