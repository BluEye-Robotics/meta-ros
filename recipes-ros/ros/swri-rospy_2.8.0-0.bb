DESCRIPTION = "This package provides added functionaliy on top of rospy, including a single-threaded callback queue."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rospy std-msgs std-srvs"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_rospy/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cfe0dd33baaf2b9f81dc68fc116dddb1"
SRC_URI[sha256sum] = "ef28b82f93c59cc85483350c15bc84017df23124d9a81a319f7950d6211de416"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_rospy-2.8.0-0"

inherit catkin
