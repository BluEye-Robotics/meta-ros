DESCRIPTION = "ROS wrapper for Python SpeechRecognition library"
AUTHOR = "Yuki Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure speech-recognition-msgs audio-capture audio-common-msgs dynamic-reconfigure python-speechrecognition-pip sound-play speech-recognition-msgs"

RDEPENDS_${PN} = "audio-capture audio-common-msgs dynamic-reconfigure python-speechrecognition-pip sound-play speech-recognition-msgs"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/ros_speech_recognition/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c87b9782e8d4d0268474b4758c704b6c"
SRC_URI[sha256sum] = "3a1828e47134ee6690e3c7e8d10e99319823987697a0aa45c48a5ffa9731b878"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-ros_speech_recognition-2.1.11-0"

inherit catkin
