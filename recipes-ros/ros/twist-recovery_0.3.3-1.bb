DESCRIPTION = "A recovery behavior that performs a particular used-defined twist."
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "base-local-planner costmap-2d geometry-msgs nav-core pluginlib tf2-geometry-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/twist_recovery/0.3.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b35de80710e7daa25e426373de7b34cf"
SRC_URI[sha256sum] = "42f3ed698ba40488337c23be1ee88d0980097420c6ef3c81003dcfdad3d75d0b"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-twist_recovery-0.3.3-1"

inherit catkin
