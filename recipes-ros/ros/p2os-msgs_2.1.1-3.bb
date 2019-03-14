DESCRIPTION = "Defines the messages that are used to communicate with the p2os_driver package and the ROS infrastructure."
AUTHOR = "Hunter L. Allen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/melodic/p2os_msgs/2.1.1-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fd4e28a2d4fdff114da379fee685305f"
SRC_URI[sha256sum] = "03bd75df3567d74a4b0e3357d73ae5cf4085fc772aa1c65e36078f4afb566b9f"

ROS_SPN = "p2os"
S = "${WORKDIR}/p2os-release-release-melodic-p2os_msgs-2.1.1-3"

inherit catkin
