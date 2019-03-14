DESCRIPTION = "jsk_hark_msgs"
AUTHOR = "Shohei Fujii"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs message-runtime"

SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/melodic/jsk_hark_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6665266193c8631631d14d8e287b36b0"
SRC_URI[sha256sum] = "f9bcc221412c9950f156dc4c57c6dd8ca9aa4eff1201c12a412a05211fcd07ea"

ROS_SPN = "jsk_common_msgs"
S = "${WORKDIR}/jsk_common_msgs-release-release-melodic-jsk_hark_msgs-4.3.1-0"

inherit catkin
