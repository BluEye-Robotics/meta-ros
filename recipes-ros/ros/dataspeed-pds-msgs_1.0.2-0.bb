DESCRIPTION = "Messages for the Dataspeed Inc. Power Distribution System (PDS)"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime rosbag-migration-rule"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_pds-release/archive/release/melodic/dataspeed_pds_msgs/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8d7441ee5315f18c3c5583b6df5602be"
SRC_URI[sha256sum] = "9b0543765ab6f1173f9e4dc3f8e38a3be0843b3a9a439bcfdffd505a1b436ba5"

ROS_SPN = "dataspeed_pds"
S = "${WORKDIR}/dataspeed_pds-release-release-melodic-dataspeed_pds_msgs-1.0.2-0"

inherit catkin
