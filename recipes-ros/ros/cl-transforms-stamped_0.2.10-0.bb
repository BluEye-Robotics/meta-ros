DESCRIPTION = "Implementation of TF datatypes"
AUTHOR = "Lorenz Moesenlechner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cl-transforms  geometry-msgs std-msgs"

RDEPENDS_${PN} = "cl-transforms  geometry-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_transforms_stamped/0.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "11ebac5b92281dcd11d2d26af6564987"
SRC_URI[sha256sum] = "8bb4cba56d66bb1a706d682930d296c70c682782f71a4843f623e386bec7c834"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_transforms_stamped-0.2.10-0"

inherit catkin
