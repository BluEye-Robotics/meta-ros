DESCRIPTION = "The yosemite_valley package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-ros"

SRC_URI = "https://github.com/ros-gbp/uav_testing-release/archive/release/melodic/yosemite_valley/0.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "add127bbbfc8640e14e9ebe1338f7d14"
SRC_URI[sha256sum] = "17ea9be47c92993675a8ed37c5debe9afe9143406b2f2db5660305e58f02ce23"

ROS_SPN = "uav_testing"
S = "${WORKDIR}/uav_testing-release-release-melodic-yosemite_valley-0.0.1-1"

inherit catkin
