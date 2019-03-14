DESCRIPTION = "Yujin's Open Control System messages, services and actions"
AUTHOR = "Jorge Santos"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs std-msgs std-srvs geometry-msgs message-generation dynamic-reconfigure actionlib-msgs std-msgs std-srvs geometry-msgs message-runtime dynamic-reconfigure"

RDEPENDS_${PN} = "actionlib-msgs std-msgs std-srvs geometry-msgs message-runtime dynamic-reconfigure"

SRC_URI = "https://github.com/yujinrobot-release/yocs_msgs-release/archive/release/melodic/yocs_msgs/0.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f76ae2c95faf6e20af023af206ba0b35"
SRC_URI[sha256sum] = "92aa5df09147dc1819de1d4415efe58d267744ca6cbf9ffe4dbb742d1713cdcc"

S = "${WORKDIR}/yocs_msgs-release-release-melodic-yocs_msgs-0.7.0-0"

inherit catkin
