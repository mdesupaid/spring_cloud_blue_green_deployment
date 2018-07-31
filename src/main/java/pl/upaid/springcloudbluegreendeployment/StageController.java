package pl.upaid.springcloudbluegreendeployment;

import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StageController {
    private final StageProperties stageProperties;

    @RequestMapping
    public Stage color() {
        if (Stage.BLUE.getId()
                      .equalsIgnoreCase(stageProperties.getStage())) {
            return Stage.BLUE;
        }
        return Stage.GREEN;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    static class Stage {
        public static final Stage GREEN = new Stage("green");
        public static final Stage BLUE = new Stage("blue");
        private String id;
    }
}
