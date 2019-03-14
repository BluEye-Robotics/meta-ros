DESCRIPTION = "A ROS node that simply forwards odometry information."
AUTHOR = "Ioan A. Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "angles tf2-geometry-msgs geometry-msgs message-filters nav-msgs rosconsole roscpp rospy tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/fake_localization/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "421247d55a69020aaf414bb25935765b"
SRC_URI[sha256sum] = "d18ea7beb5f10b7eb2ea3d1578f8ae3b2d4db9f314ac25ed8d130a90cec74450"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-fake_localization-1.16.2-0"

inherit catkin
