DESCRIPTION = "A recovery behavior that performs a particular used-defined twist."
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "base-local-planner costmap-2d geometry-msgs nav-core pluginlib tf2-geometry-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/twist_recovery/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "19e6cd5456c25c4d5f2b2737053e5f71"
SRC_URI[sha256sum] = "8c67a2c46844a984e92f59e344590deedd9525f2bfc7b3201c6a1e8999c2d881"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-twist_recovery-0.3.2-0"

inherit catkin
