DESCRIPTION = "Meshes and URDF descriptions for Gem vehicle"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=6c4b0dfc2c040991f7798d2c24b8fc03"

DEPENDS = ""

RDEPENDS_${PN} = "urdf xacro hector-gazebo-plugins"

SRC_URI = "https://github.com/robustify/igvc_self_drive_sim-release/archive/release/melodic/igvc_self_drive_description/0.1.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d3967f2e229eae4e4fb6940183001583"
SRC_URI[sha256sum] = "fa2ffa41025c6113ccd2b1ae750a29c23e8b50b5f2a52f3dad64a764afbd90f3"

ROS_SPN = "igvc_self_drive_sim"
S = "${WORKDIR}/igvc_self_drive_sim-release-release-melodic-igvc_self_drive_description-0.1.4-1"

inherit catkin
