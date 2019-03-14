DESCRIPTION = "RTAB-Map's standalone library. RTAB-Map is a RGB-D SLAM approach with real-time constraints."
AUTHOR = "Mathieu Labbe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "qt-gui-cpp pcl libsqlite3-dev zlib libfreenect-dev libopenni-dev libvtk-qt cv-bridge proj octomap libg2o qt-gui-cpp pcl libsqlite3-dev zlib libfreenect-dev libopenni-dev libvtk-qt cv-bridge octomap libg2o"

RDEPENDS_${PN} = "qt-gui-cpp pcl libsqlite3-dev zlib libfreenect-dev libopenni-dev libvtk-qt cv-bridge octomap libg2o"

SRC_URI = "https://github.com/introlab/rtabmap-release/archive/release/melodic/rtabmap/0.17.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "485491e9757220a4b57a4d4a5831daf0"
SRC_URI[sha256sum] = "ef29a24868205118c1363dc6d9b8700ece63647ee2c10b2cbefd1b2741f76a6d"

S = "${WORKDIR}/rtabmap-release-release-melodic-rtabmap-0.17.6-0"

inherit catkin
