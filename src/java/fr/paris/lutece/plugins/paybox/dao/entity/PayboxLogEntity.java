/*
 * Copyright (c) 2002-2013, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.paybox.dao.entity;

import java.util.Date;


/**
 * The Class PayboxLogEntity.
 */
public class PayboxLogEntity
{
    /** The date. */
    private Date _date;

    /** The id. */
    private Long _id;

    /** The order reference. */
    private String _orderReference;

    /**
     * Gets the date.
     *
     * @return the date
     */
    public Date getDate(  )
    {
        return this._date;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId(  )
    {
        return this._id;
    }

    /**
     * Gets the order reference.
     *
     * @return the orderReference
     */
    public String getOrderReference(  )
    {
        return this._orderReference;
    }

    /**
     * Sets the date.
     *
     * @param date the date to set
     */
    public void setDate( final Date date )
    {
        this._date = date;
    }

    /**
     * Sets the id.
     *
     * @param id the id to set
     */
    public void setId( final Long id )
    {
        this._id = id;
    }

    /**
     * Sets the order reference.
     *
     * @param orderReference the orderReference to set
     */
    public void setOrderReference( final String orderReference )
    {
        this._orderReference = orderReference;
    }
}
