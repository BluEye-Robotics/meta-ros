DESCRIPTION = "The bayesian_belief_networks package form https://github. com/eBay/bayesian-belief-networks, Authored by Neville Newey, Anzar Afaq, Copyright 2013 eBay Software Foundation"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=e8978a5103d23266fc6f8ec03dc9eb16"

DEPENDS = "rospy std-msgs mk git message-generation rospy std-msgs message-runtime"

RDEPENDS_${PN} = "rospy std-msgs message-runtime"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/bayesian_belief_networks/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c14d9539b2cccb97c3f015dfa459a5e8"
SRC_URI[sha256sum] = "0c8068d7e845e580945f2bad1b3944b43bec26cb1623a3834081dc85d90250dc"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-bayesian_belief_networks-2.1.11-0"

inherit catkin
