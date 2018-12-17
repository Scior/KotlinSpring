package net.flyingalpaca.copier.app.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 * ルートのURLのマッピングを行うコントローラー.
 *
 * @author Suita Fujino
 */

@Controller
class RootController {

    /**
     * テンプレートファイルのパス
     */
    private enum class PathTemplate(val path: String) {
        INDEX("index"),
        EDIT("edit"),
        LOGIN("login"),
        ADD("add")
    }

    @GetMapping("")
    fun index(): String {
        return PathTemplate.INDEX.path
    }

}
