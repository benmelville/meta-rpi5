import QtQuick

Window {
    width: 640
    height: 480
    visible: true
    title: qsTr("Hello World")

    Rectangle {
        id: rect
        color: "purple"
        width: parent.width
        height: parent.height
    }


}
