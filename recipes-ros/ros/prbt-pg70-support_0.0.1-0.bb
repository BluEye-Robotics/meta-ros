DESCRIPTION = "PRBT support for Schunk pg70 gripper."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "prbt-support prbt-ikfast-manipulator-plugin prbt-moveit-config schunk-description xacro"

SRC_URI = "https://github.com/PilzDE/prbt_grippers-release/archive/release/melodic/prbt_pg70_support/0.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e7a1c83d40892e543a14af3d477ed4bf"
SRC_URI[sha256sum] = "0baa13c05cfc769fb079cf7977767c2dc6ead50de092cd014a04e12b3e3b0ee3"

ROS_SPN = "prbt_grippers"
S = "${WORKDIR}/prbt_grippers-release-release-melodic-prbt_pg70_support-0.0.1-0"

inherit catkin
