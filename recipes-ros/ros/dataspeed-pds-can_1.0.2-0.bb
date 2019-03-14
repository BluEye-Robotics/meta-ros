DESCRIPTION = "Interface to the Dataspeed Inc. Power Distribution System (PDS) via CAN"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dataspeed-can-msg-filters roscpp nodelet can-msgs dataspeed-pds-msgs message-filters"

RDEPENDS_${PN} = "roslaunch dataspeed-can-usb"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_pds-release/archive/release/melodic/dataspeed_pds_can/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "58c660c39f46d112516d4f82ddb77b7e"
SRC_URI[sha256sum] = "9ac85ae64a11d73e1049f6971720e1dddfe9af4548df5ed6cd083d855d60dbd4"

ROS_SPN = "dataspeed_pds"
S = "${WORKDIR}/dataspeed_pds-release-release-melodic-dataspeed_pds_can-1.0.2-0"

inherit catkin
