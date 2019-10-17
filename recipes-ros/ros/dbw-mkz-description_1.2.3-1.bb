DESCRIPTION = "URDF and meshes describing the Lincoln MKZ."
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "roslaunch urdf xacro robot-state-publisher"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz_description/1.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4abec6e43dc91a19fea6fd7a70e72996"
SRC_URI[sha256sum] = "342433ddcb9d4f194348334c952eb39a39f0d6d6290ed9c8e8ef97665860b095"

ROS_SPN = "dbw_mkz_ros"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz_description-1.2.3-1"

inherit catkin
