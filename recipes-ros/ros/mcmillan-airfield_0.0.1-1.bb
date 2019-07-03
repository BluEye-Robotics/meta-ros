DESCRIPTION = "The mcmillan_airfield package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-ros"

SRC_URI = "https://github.com/ros-gbp/uav_testing-release/archive/release/melodic/mcmillan_airfield/0.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9426e12381660500f666263b8e2c5811"
SRC_URI[sha256sum] = "68b3833258188f562362e22fb6e06645950ceace55d877c9a2f651719860152f"

ROS_SPN = "uav_testing"
S = "${WORKDIR}/uav_testing-release-release-melodic-mcmillan_airfield-0.0.1-1"

inherit catkin
