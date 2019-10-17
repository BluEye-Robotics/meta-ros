DESCRIPTION = "ROS wrapper for Python SpeechRecognition library"
AUTHOR = "Yuki Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure speech-recognition-msgs audio-capture audio-common-msgs dynamic-reconfigure python3-speechrecognition-pip sound-play speech-recognition-msgs"

RDEPENDS_${PN} = "audio-capture audio-common-msgs dynamic-reconfigure python3-speechrecognition-pip sound-play speech-recognition-msgs"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/ros_speech_recognition/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "92ae5ea42999b751b73a13f7cb4f49a2"
SRC_URI[sha256sum] = "9c2768a7d74e51dad3f6f52f0e9fc70ae558b1bf80f05263bc09e83112d503d8"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-ros_speech_recognition-2.1.13-1"

inherit catkin
