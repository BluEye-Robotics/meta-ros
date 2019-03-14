DESCRIPTION = "Metapackage allowing easy installation of Velodyne simulation components."
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "velodyne-description velodyne-gazebo-plugins"

SRC_URI = "https://github.com/DataspeedInc-release/velodyne_simulator-release/archive/release/melodic/velodyne_simulator/1.0.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d8d8bfb987a81b666fe0c0e6da1af8e7"
SRC_URI[sha256sum] = "d6cbbbf0f73845a641801a326ecb69780982d3e6523330cb0358093e16b9ea4d"

S = "${WORKDIR}/velodyne_simulator-release-release-melodic-velodyne_simulator-1.0.9-0"

inherit catkin
