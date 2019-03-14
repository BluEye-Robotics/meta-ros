DESCRIPTION = "ROS rqt GUI for the Dataspeed Inc. Power Distribution System (PDS)"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy rqt-gui rqt-gui-py python-pyqt5 dataspeed-pds-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_pds-release/archive/release/melodic/dataspeed_pds_rqt/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ba434e3f62c04726acf9c19f73b2ffc2"
SRC_URI[sha256sum] = "e88f4d791492e0e2966a559a4af4e2b676ce72d2710220ee67c939da43e5d186"

ROS_SPN = "dataspeed_pds"
S = "${WORKDIR}/dataspeed_pds-release-release-melodic-dataspeed_pds_rqt-1.0.2-0"

inherit catkin
