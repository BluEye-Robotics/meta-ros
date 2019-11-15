DESCRIPTION = "The laser_scan_densifier takes in a LaserScan message and densifies it. Node is inspired by laser_scan_sparsifier (http://wiki. ros. org/laser_scan_sparsifier)."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp nodelet sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/laser_scan_densifier/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5a2da73011224af279fe7dd8aa495758"
SRC_URI[sha256sum] = "01ba3aadc514a2280e928f203ee249467992b0b7bbae708aa4f27a0e09df6bdd"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-laser_scan_densifier-0.7.1-1"

inherit catkin
