DESCRIPTION = "This package contains visualization tools for Franka Emika."
AUTHOR = "Franka Emika GmbH"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "sensor-msgs roscpp libfranka"

RDEPENDS_${PN} = "franka-description xacro"

SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/melodic/franka_visualization/0.6.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "16abc3b239197eddca6e8b011dd467ae"
SRC_URI[sha256sum] = "c6854a45b228f4aacf838c5bc70ef99cc8171d6d3fa4b745249d90afe9f6f350"

ROS_SPN = "franka_ros"
S = "${WORKDIR}/franka_ros-release-release-melodic-franka_visualization-0.6.0-1"

inherit catkin
