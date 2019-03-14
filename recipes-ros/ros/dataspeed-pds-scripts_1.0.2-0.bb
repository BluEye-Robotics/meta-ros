DESCRIPTION = "Test scripts to interface to the Dataspeed Inc. Power Distribution System (PDS)"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rospy dataspeed-pds-msgs"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_pds-release/archive/release/melodic/dataspeed_pds_scripts/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6270e2bcf737af91cdd0241b3c6303fe"
SRC_URI[sha256sum] = "9affa7c314ddfe3804829e680b0889aef2e5b9b17c0ca0334cdf0b647ab9f666"

ROS_SPN = "dataspeed_pds"
S = "${WORKDIR}/dataspeed_pds-release-release-melodic-dataspeed_pds_scripts-1.0.2-0"

inherit catkin
