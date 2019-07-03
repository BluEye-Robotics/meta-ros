DESCRIPTION = "The sand_island package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-ros"

SRC_URI = "https://github.com/ros-gbp/uav_testing-release/archive/release/melodic/sand_island/0.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b44703d2d7a3c60b5516f096ebe8d25e"
SRC_URI[sha256sum] = "fa4a4a3f74588458997cdc7eefa1be98c9dbc08d98f53ab426b40cea4530fa90"

ROS_SPN = "uav_testing"
S = "${WORKDIR}/uav_testing-release-release-melodic-sand_island-0.0.1-1"

inherit catkin
