DESCRIPTION = "URDF and meshes describing the Lincoln MKZ."
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "roslaunch urdf xacro robot-state-publisher"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz_description/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6bac0fc6d09502fe048e42b128c8b784"
SRC_URI[sha256sum] = "4a4a3e557b1eab9781065fa06b4283e97ab6d25d44f0d9696c9720418ae8b0e5"

ROS_SPN = "dbw_mkz_ros"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz_description-1.1.1-0"

inherit catkin
