DESCRIPTION = "Basic test nodes for Pyros dynamic ROS interface"
AUTHOR = "AlexV"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation roslint rospy std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/pyros-dev/pyros-test-release/archive/release/melodic/pyros_test/0.0.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8fb905f1af5c7134042e48c0efd68032"
SRC_URI[sha256sum] = "9f1c355999d96debda08aa9cc999dade80d4c8ba9de137fabd122eb9050c35ea"

S = "${WORKDIR}/pyros-test-release-release-melodic-pyros_test-0.0.6-1"

inherit catkin
