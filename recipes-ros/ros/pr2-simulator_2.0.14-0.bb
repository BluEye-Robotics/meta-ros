DESCRIPTION = "The pr2_simulator package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2-gazebo pr2-controller-configuration-gazebo pr2-gazebo-plugins"

RDEPENDS_${PN} = "pr2-gazebo pr2-controller-configuration-gazebo pr2-gazebo-plugins"

SRC_URI = "https://github.com/pr2-gbp/pr2_simulator-release/archive/release/melodic/pr2_simulator/2.0.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2239ed8e2c60e7e0b2739eee9c4b2d0c"
SRC_URI[sha256sum] = "4502d2d3680adc3ad5bb876120527c7deb7642208da743e0c853353d8524b0cc"

S = "${WORKDIR}/pr2_simulator-release-release-melodic-pr2_simulator-2.0.14-0"

inherit catkin
