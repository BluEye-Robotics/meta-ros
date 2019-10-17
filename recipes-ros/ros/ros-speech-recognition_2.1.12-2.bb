DESCRIPTION = "ROS wrapper for Python SpeechRecognition library"
AUTHOR = "Yuki Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure speech-recognition-msgs audio-capture audio-common-msgs dynamic-reconfigure python-speechrecognition-pip sound-play speech-recognition-msgs"

RDEPENDS_${PN} = "audio-capture audio-common-msgs dynamic-reconfigure python-speechrecognition-pip sound-play speech-recognition-msgs"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/ros_speech_recognition/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f728c38562412fafb0198968eeac8df9"
SRC_URI[sha256sum] = "3a5c017210d53c9145a052061d617079d12de38b5ec8fbd3703f6c32f7866037"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-ros_speech_recognition-2.1.12-2"

inherit catkin
