DESCRIPTION = "Merging multiple 3D maps, represented as pointclouds, without knowledge of initial positions of robots."
AUTHOR = "Jiri Horner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp pcl-ros tf2-ros tf2-eigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/hrnr/map-merge-release/archive/release/melodic/map_merge_3d/0.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "274f2eecb33a9193279135ae34b7db2a"
SRC_URI[sha256sum] = "7413dc94e5c7e8b52bf48c1b7be92e7b7381fac6cd5db59b93e5b9fdf5a4d163"

ROS_SPN = "map_merge"
S = "${WORKDIR}/map-merge-release-release-melodic-map_merge_3d-0.1.1-0"

inherit catkin
