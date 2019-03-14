DESCRIPTION = "The backward_ros package is a ros wrapper of backward-cpp from https://github. com/bombela/backward-cpp"
AUTHOR = ""
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roscpp libdw-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/pal-gbp/backward_ros-release/archive/release/melodic/backward_ros/0.1.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8b2d6ceb6bfca2d5c6734cbebc78bda5"
SRC_URI[sha256sum] = "3cec255db3ff1af9bfc80b31ca88a9be50f11d663d9213edf457b0a7ed7eb967"

S = "${WORKDIR}/backward_ros-release-release-melodic-backward_ros-0.1.7-0"

inherit catkin
