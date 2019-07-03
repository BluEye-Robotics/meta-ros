DESCRIPTION = "PRBT support for Schunk pg70 gripper."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "prbt-support prbt-ikfast-manipulator-plugin prbt-moveit-config schunk-description xacro"

SRC_URI = "https://github.com/PilzDE/prbt_grippers-release/archive/release/melodic/prbt_pg70_support/0.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b1174e55103eb20b4851088c359aa3d3"
SRC_URI[sha256sum] = "71d12733360cd04b208ed6cf976217fcbaea7231298f5ad006b7dc10be3ab7b3"

ROS_SPN = "prbt_grippers"
S = "${WORKDIR}/prbt_grippers-release-release-melodic-prbt_pg70_support-0.0.4-1"

inherit catkin
