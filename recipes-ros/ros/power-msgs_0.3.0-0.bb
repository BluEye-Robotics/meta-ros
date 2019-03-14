DESCRIPTION = "ROS messages for power measurement and breaker control."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs message-runtime"

SRC_URI = "https://github.com/fetchrobotics-gbp/power_msgs-release/archive/release/melodic/power_msgs/0.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "de2f9eb8d9d696257767811d54e73e5b"
SRC_URI[sha256sum] = "97f1dcb8217d6baa4939f53e64b59498cc550a26c3ed03f13249041f78ff120b"

S = "${WORKDIR}/power_msgs-release-release-melodic-power_msgs-0.3.0-0"

inherit catkin
