DESCRIPTION = "voxel_grid provides an implementation of an efficient 3D voxel grid. The occupancy grid can support 3 different representations for the state of a cell: marked, free, or unknown. Due to the underlying implementation relying on bitwise and and or integer operations, the voxel grid only supports 16 different levels per voxel column. However, this limitation yields raytracing and cell marking performance in the grid comparable to standard 2D structures making it quite fast compared to most 3D structures."
AUTHOR = "Eitan Marder-Eppstein, Eric Berger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/voxel_grid/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ad120fed3782f941886c52038329d946"
SRC_URI[sha256sum] = "8102b9aae0f9856c35f38841945094d77eec895fea6d8caaac479cfa162a56d4"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-voxel_grid-1.16.2-0"

inherit catkin
