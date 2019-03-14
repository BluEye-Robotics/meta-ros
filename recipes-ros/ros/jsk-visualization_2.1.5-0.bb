DESCRIPTION = ""
AUTHOR = "Ryohei Ueda"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "jsk-rqt-plugins jsk-rviz-plugins jsk-interactive jsk-interactive-marker jsk-interactive-test"

RDEPENDS_${PN} = "jsk-rqt-plugins jsk-rviz-plugins jsk-interactive jsk-interactive-marker jsk-interactive-test"

SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/melodic/jsk_visualization/2.1.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a50434c9ff4cf6bc75493df4c6249cba"
SRC_URI[sha256sum] = "6a77306292fe2644e5cd6ad9df30e442aa904f920bc373a0b8b5ff9a2d0e0411"

S = "${WORKDIR}/jsk_visualization-release-release-melodic-jsk_visualization-2.1.5-0"

inherit catkin
