//
//  ViewController.kt
//  KotlinTest1
//
//  Created by Janek Szynal on 27/05/2018.
//  Copyright © 2018 PJM. All rights reserved.
//

import kotlinx.cinterop.*
import platform.Foundation.*
import platform.UIKit.*

@ExportObjCClass
class ViewController : UIViewController {

    constructor(aDecoder: NSCoder) : super(aDecoder)
    override fun initWithCoder(aDecoder: NSCoder) = initBy(ViewController(aDecoder))

    @ObjCOutlet
    lateinit var label: UILabel

    @ObjCOutlet
    lateinit var textField: UITextField

    @ObjCOutlet
    lateinit var button: UIButton

    @ObjCAction
    fun buttonPressed() {
        label.text = "Konan says: 'Hello, ${textField.text}!'"
    }


    override fun viewDidLoad() {
        super.viewDidLoad()
        print("yo")
    }
}
