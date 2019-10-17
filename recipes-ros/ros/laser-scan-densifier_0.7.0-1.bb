DESCRIPTION = "The laser_scan_densifier takes in a LaserScan message and densifies it. Node is inspired by laser_scan_sparsifier (http://wiki. ros. org/laser_scan_sparsifier)."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp nodelet sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/laser_scan_densifier/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8af8954cbb6587f87a0e62f511c755ad"
SRC_URI[sha256sum] = "f14e3cfe77ca5f18eb72d9bbf4619383f3f6f0cbe4623980b9fffb9f91795c01"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-laser_scan_densifier-0.7.0-1"

inherit catkin
