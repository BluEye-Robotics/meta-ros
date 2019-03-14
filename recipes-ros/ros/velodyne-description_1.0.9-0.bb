DESCRIPTION = "URDF and meshes describing Velodyne laser scanners."
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "urdf xacro"

SRC_URI = "https://github.com/DataspeedInc-release/velodyne_simulator-release/archive/release/melodic/velodyne_description/1.0.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0e4bd32ebbbe24ce07c5375c6de3a23a"
SRC_URI[sha256sum] = "3c21ef0d86e8d52e10b95d846d089c029d80b58f6f12b52bf19ed7f3a94c3094"

ROS_SPN = "velodyne_simulator"
S = "${WORKDIR}/velodyne_simulator-release-release-melodic-velodyne_description-1.0.9-0"

inherit catkin
