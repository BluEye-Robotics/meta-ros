DESCRIPTION = "speech_recognition_msgs"
AUTHOR = "Yuki Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs message-runtime"

SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/melodic/speech_recognition_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f380a85d009a854aa6594bb00b202008"
SRC_URI[sha256sum] = "f6b39c252c011e5572aa0a1fed50b3ecdefa2abe7c96da0259fd1e578cac6541"

ROS_SPN = "jsk_common_msgs"
S = "${WORKDIR}/jsk_common_msgs-release-release-melodic-speech_recognition_msgs-4.3.1-0"

inherit catkin
