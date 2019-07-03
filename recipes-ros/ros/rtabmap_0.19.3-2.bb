DESCRIPTION = "RTAB-Map's standalone library. RTAB-Map is a RGB-D SLAM approach with real-time constraints."
AUTHOR = "Mathieu Labbe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "qt-gui-cpp pcl libsqlite3-dev zlib libfreenect-dev libopenni-dev libvtk-qt cv-bridge proj octomap libg2o qt-gui-cpp pcl libsqlite3-dev zlib libfreenect-dev libopenni-dev libvtk-qt cv-bridge octomap libg2o"

RDEPENDS_${PN} = "qt-gui-cpp pcl libsqlite3-dev zlib libfreenect-dev libopenni-dev libvtk-qt cv-bridge octomap libg2o"

SRC_URI = "https://github.com/introlab/rtabmap-release/archive/release/melodic/rtabmap/0.19.3-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "733646a54b7f4df0194889024a91a033"
SRC_URI[sha256sum] = "cb053873fe946d0ceba2377f463bcd5387995eb2c9e3a0ca0ac80788fe0ed731"

S = "${WORKDIR}/rtabmap-release-release-melodic-rtabmap-0.19.3-2"

inherit catkin
