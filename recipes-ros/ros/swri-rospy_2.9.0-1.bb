DESCRIPTION = "This package provides added functionaliy on top of rospy, including a single-threaded callback queue."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rospy std-msgs std-srvs"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_rospy/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "82afc6bbdec08fe681a386557a9e4b1e"
SRC_URI[sha256sum] = "d3f8916320c11e128b76d74544e1cd53b0e7e2a17a7c4441bf8ef81fad5dce42"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_rospy-2.9.0-1"

inherit catkin
