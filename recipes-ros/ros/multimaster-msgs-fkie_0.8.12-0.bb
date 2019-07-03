DESCRIPTION = "The messages required by multimaster packages."
AUTHOR = "Alexander Tiderko"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/multimaster_msgs_fkie/0.8.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0588eddc83fb64b9cb550a5d7186433e"
SRC_URI[sha256sum] = "e69b1c634583d23b9fce4e222c7e4f1728b6849811b9fcb13ef41b0bb26bbc6a"

ROS_SPN = "multimaster_fkie"
S = "${WORKDIR}/multimaster_fkie-release-release-melodic-multimaster_msgs_fkie-0.8.12-0"

inherit catkin
