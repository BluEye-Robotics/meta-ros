DESCRIPTION = "This package provides some objects and furniture for gazebo simulation."
AUTHOR = "Nadia Hammoudeh Garcia"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "cob-description gazebo-ros"

SRC_URI = "https://github.com/ipa320/cob_simulation-release/archive/release/melodic/cob_gazebo_objects/0.7.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5b61c7e3b15d398b27776cda70b958fa"
SRC_URI[sha256sum] = "b78c2a7a852146004e0862598428506a8b39d905be38211a269f28dcb1f3a7f1"

ROS_SPN = "cob_simulation"
S = "${WORKDIR}/cob_simulation-release-release-melodic-cob_gazebo_objects-0.7.3-1"

inherit catkin
